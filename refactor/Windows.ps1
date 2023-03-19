$files = Get-ChildItem .\ -Recurse *.* | where { ! $_.PSIsContainer }

foreach ($f in $files){
    if ($f -notlike '.idea') {
        (gc $f.FullName -raw).Replace( 'lwjgl', 'lwjgl3' )| Out-File -encoding utf8 $f.FullName
        (gc $f.FullName -raw).Replace( 'lwjgl33', 'lwjgl3') | Out-File -encoding utf8 $f.FullName
        (gc $f.FullName -raw).Replace('lwjgl3.org', 'lwjgl.org') | Out-File -encoding utf8 $f.FullName
    }

} 

#Get-ChildItem -Path . | ForEach-Object { Rename-Item -Path $_ -NewName { ($_.Name).Replace('*lwjgl*','lwjgl3') } }
gci -Recurse -Directory -Filter lwjgl -Path . | Ren -NewName { ($_.Name).Replace('lwjgl','lwjgl3') }
gci -Recurse -File -Path . | Ren -NewName { ($_.Name).Replace('lwjgl','lwjgl3') }
gci -Recurse -File -Path . | Ren -NewName { ($_.Name).Replace('lwjgl33','lwjgl3') }
gci -Recurse .\modules\lwjgl3\core\src\main\c\

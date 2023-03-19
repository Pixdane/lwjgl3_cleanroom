LC_ALL=C find ./ -type f -exec sed -i'' -e 's/lwjgl/lwjgl3/g' {} \;
LC_ALL=C find ./ -type f -exec sed -i'' -e 's/lwjgl33/lwjgl3/g' {} \;
LC_ALL=C find ./ -type f -exec sed -i'' -e 's/lwjgl3\.org/lwjgl.org/g' {} \;
mv ./modules/lwjgl ./modules/lwjgl3
find ./modules/* -name lwjgl -type d -exec rename -f 's/lwjgl(?!3)/lwjgl3/g' {} \+
find ./ -name "*lwjgl*" -type f -exec rename -f 's/lwjgl(?!3)/lwjgl3/g' {} \+

# find ./ -type f -exec sed -i -e 's/org_lwjgl/org_lwjgl3/g' {} \;
# find ./ -type f -exec sed -i -e 's/org\.lwjgl/org.lwjgl3/g' {} \;
# find ./ -type f -exec sed -i -e 's/org\/lwjgl/org\/lwjgl3/g' {} \;
find ./ -type f -exec sed -i -e 's/lwjgl/lwjgl3/g' {} \;
find ./ -type f -exec sed -i -e 's/lwjgl33/lwjgl3/g' {} \;
find ./ -type f -exec sed -i -e 's/lwjgl3\.org/lwjgl.org/g' {} \;
mv ./modules/lwjgl ./modules/lwjgl3
find ./modules/* -name lwjgl -type d -exec rename -f 's/lwjgl(?!3)/lwjgl3/g' {} \+
find ./ -name "*lwjgl*" -type f -exec rename -f 's/lwjgl(?!3)/lwjgl3/g' {} \+

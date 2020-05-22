del build\libs\*.jar
call gradlew build
mkdir c:\project
IF EXIST build\libs\*.jar (copy build\libs\*.jar c:\project) ELSE (echo Compile error. Do something with it. Ciao.)

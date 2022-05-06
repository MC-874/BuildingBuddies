Building Buddies

Created by Daniela Lopez, David Hinojosa, Max Clarke

Step 1: Open CMD and use cd to change directory to where the grammar file is stored.

Step 2: set doskeys to run ANTLR: "doskey antlr4=java org.antlr.v4.Tool $*" and "doskey grun=java org.antlr.v4.gui.TestRig $*"

Step 3: Type "antlr4 SentenceGrammar.g4" to compile grammar file.

Step 4: Type "antlr4 -no-listener -visitor SentenceGrammar.g4" to generate a visitor.

Step 5: Type "javac SentenceGrammar*.java" to compile all java files.

Step 6: Compile all other java files in folder and Run "BuildBuddiesMainWindow" with "java BuildBuddiesMainWindow" in the CMD.

Step 7: Import all project files to the IDE and run the code.

Step 8: Run the IDE.

  

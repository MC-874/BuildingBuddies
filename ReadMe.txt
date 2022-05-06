Building Buddies

Created by Daniela Lopez, David Hinojosa, Max Clarke

Step 1: Open CMD and use "cd" command to change directory to where the grammar file is stored.

Step 2: set doskeys to run ANTLR: "doskey antlr4=java org.antlr.v4.Tool $*" and "doskey grun=java org.antlr.v4.gui.TestRig $*"

Step 3: Type "antlr4 -no-listener -visitor SentenceGrammar.g4" to compile grammar files and generate a visitor.

Step 4: Type "javac *.java" to compile all java files.

Step 5: Run 'BuildBuddiesMainWindow' with "java BuildBuddiesMainWindow" in the CMD.

Alternative step to replace steps 4 & 5: 

Step 4B: Import all project files to your IDE (or Code Editor) and run the code in the IDE.


  

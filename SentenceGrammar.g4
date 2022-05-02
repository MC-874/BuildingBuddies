grammar SentenceGrammar;

// Parser Rules
sentences : simpleSentence PUNCTUATION                      # simSent
            | compoundSentence PUNCTUATION	            # comSent
            ;	
simpleSentence : ARTICLE? SUBJECT VERB ARTICLE? OBJECT;					
compoundSentence : simpleSentence CONJUNCTION simpleSentence;				


// Lexer Rules
COORDINATOR : 'and' | 'but' | 'though' | 'or' | ',' ;
CONJUNCTION : COORDINATOR | ',' COORDINATOR ;
SUBJECT : 'Cat' | 'Dog'  | 'Toy' | 'Bear'  | 'I' | 'You' | 'They' | 'We' | 'Bird' | 'Mouse' ; 
VERB : 'ran' | 'ate' | 'went' | 'choose' | 'eats' | 'play' ; 
OBJECT : 'far' | 'food' | 'home' | 'guitar' | 'outside' | 'school' ;
ARTICLE : 'The' | 'a' | 'an' | 'the' ;
PUNCTUATION : '.'  '?' ','  '!' ;

WS : [ \t]+ -> skip ; // toss out whitespace

grammar SentenceGrammar;

// Parser Rules
sentences : simpleSentence PUNCTUATION | compoundSentence PUNCTUATION;
simpleSentence : ARTICLE? SUBJECT VERB ARTICLE? OBJECT;
compoundSentence : simpleSentence CONJUCTION simpleSentence;


// Lexer Rules
COORDINATOR : 'and' | 'but' | 'though' | 'or' | ',' ;
CONJUNCTION : 'Coordinator' | 'Coordinator' ',';
SUBJECT : 'Cat' | 'Dog'  | 'Toy' | 'Bear'  | 'I' | 'You' | 'They' | 'We' | 'Bird' | 'Mouse' ; 
VERB : 'ran' | 'ate' | 'went' | 'choose' | 'eats' | 'play' ; 
OBJECT : 'far' | 'food' | 'home' | 'guitar' | 'outside' | 'school' ;
ARTICLE : 'The' | 'a' | 'an' | 'the' ;
PUNCTUATION : '.'  '?' ','  '!' ;

WS : [ \t]+ -> skip ; // toss out whitespace

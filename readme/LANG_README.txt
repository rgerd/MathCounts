=== LANGUAGE DATA ===
+ How to store data for the Language Generator:
	- Nouns:
		singular, plural
		Example: 
			tree, trees
	- Adjectives:
		adjective
		Example:
			green
	- Venues:
		preposition_article_place
		Example:
			at_the_park

+ Note:
	- Underscores translate to spaces
	- Uppercase is interpreted by LangUtility


=== LANGUAGE PROCESSING ===
+ How to create a sentence that will be populated by the lang package:
	- This is the general, simplest format:
		[type_index]
		Example:
			[noun_0]
	- In order to force plurality, put a 'pl' at the end:
		[noun_0_pl] => trees
	- The available types are dictated by the class with the language data. For example, if there was a tag <moo>,
	  then you could put '[moo_0]' and get a random word from between those tags.
	- Here are the current available types:
		num (Number)
		noun (Noun)
		adj (Adjective)
		venue (Venue)
		

+ Note:
	- The indices are stored in the generator, so [noun_0] will be the same everywhere.
	- Plurality is dictated by the last number put into the sentence, unless it is forced with _pl
	- The Driver class in the main package includes an advanced usage of the LangUtiliy's populate method.
		
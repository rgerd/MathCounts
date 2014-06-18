Ok guys, I've made a huge change.

I've reduced copied code to a minimum and massively increased code reuse by using reflection.

The most important changes:
	- All of the context generation methods will be named gen# (gen1, gen2, etc.)
	 	- They must be named this otherwise the code will not work
	- All Context classes must be named Context and must extend com.Context
	- All Question classes must be named Question
	- All packages must be named after the section title that will be used in the input file (matching case)
		- Counting Lists Of Numbers -> CountingListsOfNumbers
		- This is because the title used in the input file will be used to find the context and question classes.
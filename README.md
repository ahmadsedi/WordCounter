# Word Counter in a Sentence
## Problem
Given a sentence, we need a function to count the sentence's each word. It should ignore "."
Examples: <br><br>
"UK is like no country except UK. One of the best in the world." -> {"UK"->2}, {"world"->1} <br>
"" -> empty map <br>

## Solution 
The solution split the sentence by space, creates a stream, ignore dot, filters empty strings, and group by strings.

## Setup/Requirements
* Java 11 or up
* Maven 3

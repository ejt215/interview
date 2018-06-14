# Interview Instructions

In this excercise, we would like you to fill in the implementation of a program that will read a CSV file from the filesystem, apply some rules to the file and write a new file back to the filesystem.

## Steps
1. Read example.csv from the resources directory
2. Filter out (exclude) the lines where the list price (second column) is greater than $5.00
3. Write the filtered content as a new CSV file called example-filtered.csv

> *Bonus- Filter out duplicate row ids (first column).  Keep only the first instance of a row id that was encountered


## Provided
There are three interfaces provided.  Please use them to construct your program

1. Reader
2. Writer
3. Processor

Additionally, there is a utility to parse a CSV line which you are free to use or not use

## Expected output

        
````text
"86689","3.99","2.79","2018-11-08 07:59:59","$2.79 for 1 item","Simple Sale","2018-02-25 11:52:03.098267","user","452889","044000032258","UPC-A","Nabisco (Food)","Chips Ahoy!","Candy Blasts Chocolate Chip Cookies","12.4 Oz","1","Package","null","Chocolate Chip Cookies","Cookies","Snacks","t","2013-12-26 00:00:00"
"86707","3.99","2.79","2018-11-08 07:59:59","$2.79 for 1 item","Simple Sale","2018-02-25 11:52:03.098267","user","60903","044000032258","UPC-A","Nabisco (Food)","Chips Ahoy!","Candy Blasts Chocolate Chip Cookies","12.4 Oz","1","Package","null","Chocolate Chip Cookies","Cookies","Snacks","t","2013-12-26 00:00:00"
"86656","2.69","1.67","2018-03-07 07:59:59","$5.00 for 3 item","Simple Sale","2018-02-25 11:52:03.098267","user","468832","041196915051","UPC-A","General Mills, Inc.","Progresso","Traditional Italian-Style Wedding Soup","18.5 Oz","1","Can","null","Italian Style Soup","Canned Soups, Chili, Stew & Chowder","Canned & Jarred Foods","t","2015-08-29 00:00:00"
"99792","1.76","1.57","2018-03-04 04:59:59","$1.57 for 1 item","Simple Sale","2018-02-25 12:54:16.713905","user","463189","681131152457","UPC-A","Walmart Stores, Inc.","Ol' Roy","Mini Multi-Flavor Biscuits","1.5 Lb","1","Box","null","Treats & Chews","Dog","Pet Supplies","t","2017-12-29 18:14:06"
"173920","1.99","1.67","2019-01-03 04:59:59","$5.00 for 3 item","Simple Sale","2018-02-25 12:54:16.713905","user","36159","075573000160","UPC-A","Beaumont Products, Inc.","Clearly Natural","Glycerine Soap Bar Cucumber","4 Oz 3 pack","3","Package","null","Bar Soap","Soap","Personal Care","t","2014-03-21 00:00:00"
"99854","2.28","1.78","2018-03-02 04:59:59","$1.78 for 1 item","Simple Sale","2018-02-25 13:14:01.430123","user","464297","051000138095","UPC-A","Campbell Soup Company","Campbell's Chunky","Grilled Sirloin Steak Soup With Hearty Vegetables","18.8 Oz","1","Can","null","Steak Soup","Canned Soups, Chili, Stew & Chowder","Canned & Jarred Foods","t","2013-05-10 00:00:00"

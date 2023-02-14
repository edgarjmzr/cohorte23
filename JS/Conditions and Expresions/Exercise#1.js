//Write a function to insert a name to the end of the list. Add your own name to the end of the list.

var names = ["Maria", "Antony", "Joy", "Juan"]

//1.Write a function to insert a name to the end of the list. Add your own name to the end of the list.
names.push("Edgar"); 
console.log(names);

//2.Write a function that takes in a name and checks if the list has that name. It should return back a boolean - true/false.
console.log(names.includes("Esteff"));    

//3.Write a function that takes in a list of names. This function should compare the list taken into the names list you currently have. The function should pass back an array with the names that are in both lists.
var names = ["Maria", "Antony", "Joy", "Juan"]
let 1Nueva = names.map(
    function(valor){
        return valor * 2
    }
);
console.log(1Nueva);

//4.Write a function that takes in a list of names and returns a list of Integers with the length of the names in the same order as received. Hint use the push function
function checkCount(listNames){
    let checkMap = listNames.map(
        (strings) => {
            return strings.length
        }
    )
    console.log(checkMap);
}

checkCount(["Maria", "Pedro", "Emilio"])


//Exercise #2
    //What do the following expressions evaluate to?
false || (true && false);
true || (11 + 12);
(31 + 22) || true;
true && (1 + 7);
false && (3 + 4);
(1 + 2) && true;
(32 * 4) >= 129;
false !== !true;
true === 4;
false === (847 === '847');
false === (887 == '887');
(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false;


//Exercise #2
    //What do the following expressions evaluate to?
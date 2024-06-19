//// функция выдаст слово Ping столько раз, сколько у нас определено в num

var func1 = function(){
    for(var i =0; i<num; i++) {
        console.log("Ping");
    }
}

var func2=func1;
func2();

//// функция выдаст слово Pong столько раз, сколько у нас определено в num

function myFunction(){
    for (var i = 0; i < num, i++){
    console.log("Pong");

}
}

var myNewFunction = myFunction;
myNewFunction();
// var  - to declare variable
// let
// const
// var vs let
// var a = 10;
// a = 20;
// function test(){
//     for(let i=0;i<5;i++){
//         console.log(i);
//     }
//     console.log('outside '+ i);
// }
// test();
var a = 100;
console.log(a); // 100
{
    var a = 200;
    console.log(a); // 200
}
console.log(a); // 200

var Color;
(function (Color) {
    Color[Color["Red"] = 100] = "Red";
    Color[Color["Green"] = 200] = "Green";
    Color[Color["Blue"] = 300] = "Blue";
})(Color || (Color = {}));
console.log(Color.Blue);

// 1 : Old style without promises
// function getData(){
//     var request = new XMLHttpRequest();
//     request.open('GET', 'https://jsonplaceholder.typicode.com/photos', true)
//     request.onreadystatechange = function(){
//         if(this.readyState == 4 && this.status == 200){
//             // console.log(this.responseText)
//             var response = this.responseText;
//             var data = JSON.parse(response);
//             var text = ''

//             text += '<div class="row">'
//             for(var i=0; i<data.length;i++){
                
//                 text += `
//                 <div class="col-sm-3">
//                     <div class="card">
//                         <img src="${data[i].thumbnailUrl}" class="card-img-top" alt="...">
//                         <div class="card-body">
//                         <h5 class="card-title">${data[i].title}</h5>                               
//                         </div>
//                     </div>
//                 </div> 
//                 `
//             }
//             text += '</div>'
//             document.getElementById('result').innerHTML = text;

//         }
//     }

//     request.send();
// }

// 2 : With Promises
//The code is more clean and resuable
function getData(){
    return new Promise(function(resolve, reject){
        var request = new XMLHttpRequest();
        request.open('GET', 'https://jsonplaceholder.typicode.com/photos', true)
        request.onreadystatechange = function(){
            if(this.readyState == 4 && this.status == 200){
                var response = this.responseText;
                var data = JSON.parse(response);
                resolve(data);
            }
        }
        request.send();
    });
}



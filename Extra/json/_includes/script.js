// ./_includes/data.json
// https://drive.google.com/file/d/127efc5d3eabwFsaj2ESdZYhh0xtOnHWs/view?usp=sharing
fetch('./_includes/data.json')
    .then(function(response) {
        return response.json();
    })
    .then(function(data) {
        appendData(data);
    })
    .catch(function(err) {
        console.log('error: ' + err);
    });

function appendData(data) {
    var mainContainer = document.getElementById("myData");
    for (var i = 0; i < data.length; i++) {
        var div = document.createElement("div");
        div.innerHTML = '<div id="p-' + i + '"' + ' class="item"><div class="title"><h1>' + data[i].name + '</h1><div class="small">' + data[i].description + '</div></div><div class = "item-body"><div class="row"><div class = "store"> Official </div><div class = "price" >' + data[i].oprice + '</div><div class = "button" > <a href="' + data[i].olink + '">Check Price</a></div></div><div class= "row" ><div class = "store" > Amazon </div><div class = "price">' + data[i].aprice + '</div><div class = "button"><a href="' + data[i].alink + '">Check Price</a></div></div><div class = "row"><div class = "store" > Flipkart </div><div class ="price" >' + data[i].fprice + '</div><div class = "button"> <a href="' + data[i].flink + '">Check Price</a></div></div></div><div class = "row"><div class = "store" > Other </div> <div class = "price">' + data[i].uprice + '</div><div class = "button" ><a href="' + data[i].ulink + '">Check Price</a></div></div></div></div>';
        mainContainer.appendChild(div);
    }
}
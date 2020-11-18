

//最新更新-按下
function js_toLatest() {


    //document.getElementById("article").style.display = "block";

    document.getElementById("person").style.display = "none";

    $("#article").fadeIn(1000);

    document.getElementById("side-bar-toc").style.color = "#fc6423";
    document.getElementById("side-bar-toc").style.borderBottom="1px solid #fc6423";
    document.getElementById("side-bar-overflow").style.color = "black";
    document.getElementById("side-bar-overflow").style.borderBottom="none";
}

//站点概览-按下
function js_toMessage(){

    document.getElementById("article").style.display = "none";
    //document.getElementById("person").style.display = "block";

    //$("#person").fadeIn(8600); //这个效果是颜色由浅到深显示出来
    $("#person").fadeIn(1000);

    //alert("121323232");
    document.getElementById("side-bar-overflow").style.color = "#fc6423";
    document.getElementById("side-bar-overflow").style.borderBottom="1px solid #fc6423";
    document.getElementById("side-bar-toc").style.color = "black";
    document.getElementById("side-bar-toc").style.borderBottom="none";
}
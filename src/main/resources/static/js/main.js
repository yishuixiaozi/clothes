
var selectFlg = 0;
var selectLar = 0;
var imgFlg = 0;

window.onload=function(){
    //alert("浏览器加载后就执行");
    setInterval(function(){
        //alert("我执行了");
        number_test();
        img_show();
    },3000);

};

//用来计算数
function number_test(){
    imgFlg++;
    if (imgFlg > 3){
        imgFlg = 1;
    }
    //alert("----------"+imgFlg);
}

function img_show(){
    //alert("-----"+imgFlg);
    if(imgFlg ==1 ){
        document.getElementById("img_id1").style.display="list-item";
        document.getElementById("img_id2").style.display="none";
        document.getElementById("img_id3").style.display="none";

    }else if(imgFlg == 2){
        document.getElementById("img_id1").style.display="none";
        document.getElementById("img_id2").style.display="list-item";
        document.getElementById("img_id3").style.display="none";

    }else if(imgFlg == 3){
        document.getElementById("img_id1").style.display="none";
        document.getElementById("img_id2").style.display="none";
        document.getElementById("img_id3").style.display="list-item";

    }
}


//选择搜索栏目的隐藏和显示
function showbar() {
    if (selectFlg == 0){
        //alert("即将显示");
        document.getElementById("select_search").style.display="block";
        selectFlg = 1;
    }else if (selectFlg ==1){
        //alert("即将隐藏");
        document.getElementById("select_search").style.display="none";
        //document.getElementById("select_span").innerHTML="";
        selectFlg = 0;
    }

}

//依据点的内容设置对应的值
function select_set(obj) {
    //alert(obj.toString()+"---"+obj.innerHTML)
    document.getElementById("select_span").innerHTML=obj.innerHTML;
}

//
// function showLar(obi) {
//     if(selectLar == 0){
//         // alert("即将显示")
//         //document.getElementsByClassName("header-hover-box").style.display="block";
//         document.getElementById("select_lar").style.display="block";
//         selectLar = 1;
//     }else if(selectLar ==1){
//         // alert("即将关闭")
//         document.getElementById("select_lar").style.display="none";
//         selectLar = 0;
//     }
//
// }
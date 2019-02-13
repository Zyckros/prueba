document.onclick = function(a){

var nameClass = a.target.className;

if(a.target.tagName == "DIV"){
    if(nameClass == "opcActivada"){

      a.target.className = "opcDesactivada";

    }else if( nameClass == "opcDesactivada"){

      a.target.className = "opcPorDefecto";

    }else{

      a.target.className = "opcActivada";

    }
  }
}

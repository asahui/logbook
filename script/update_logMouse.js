//Version: 0.1
//Author: asahui
//Mouse Algorithm: HY Little
//Description: Print the mouse coordinate posted to server

load("script/utils.js");
load("script/ScriptData.js");
data_prefix = "logMouse_";

ApplicationMain = Java.type("logbook.gui.ApplicationMain");

// get the greatest common divisor
function gcdFun(a, b) {
    if ( ! b) {
        return a;
    }

    return gcdFun(b, a % b);
}

function update(type, data){
    var cid = data.getField("api_serial_cid");

    if (cid != null) {
        // api_serial_cid are combined with timestamp(10) and mouseXY(11)
        var mouse = Number(cid.substring(10));
        var gcd = getData("gcd");
        if (gcd == null) {
            gcd = 1000;
        } else {
            gcd = Number(gcd);
        }

        // Try to get the constant value in the first several times
        if (mouse % gcd) {
            log("mouse:" + mouse);
            log("Please wait for const value calculation");
            var lastgcd = Number(getData("lastgcd"));
            if (lastgcd == null) {
                lastgcd = mouse;
            } else {
                lastgcd = Number(lastgcd);
            }
            var g = gcdFun(lastgcd, mouse);
            setData("lastgcd", g.toString());
            setData("gcd", g.toString());
            //log("newgcd: " + g);
            return
        }

        // mouseXY = ((mouseX+1000)*10000+(mouseY+1000)+10000) * constValue
        // constValue are varied from teitoku id
        var xy = mouse / gcd;
        var x = (((xy - 10000) / 10000) | 0) - 1000;
        var y = (xy - 10000) % 10000 - 1000;
        if (x > 0 && y > 0) {
            log("mouse:" + mouse + " x: " + x + " y: " + y);
        } else {
            log("mouse:" + mouse);
            log("Please wait for const value calculation");
        }
    }
}

function log(str) {
    main = ApplicationMain.main;
    main.printMessage(str);
}
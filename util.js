var seoul = {
   
    /********************************************************************************
     * getServiceObject: Service의 서비스Object를  가지고 온다.
     ********************************************************************************/
    getServiceObject:function(serviceName, paramObj){
        var returnObj = null;
        if($.trim(serviceName) == '')return;
        $.ajax({
            type:'POST',
            url: seoul.getValidUrl(serviceName),
            data: paramObj,
            dataType:'json',
            async: false,
            success: function(obj)
            {
                returnObj = obj;
            },
            error:function(request,status,error){
                alert("data전송 도중 에러가 발생하였습니다.");
                console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
            }
        });
        return returnObj;
    } ,
   
    /********************************************************************************
     * getDataSize: Object의 배열사이즈를 구한다. .
     ********************************************************************************/
    getDataSize:function(obj){
        return Number(obj.length);
    },
    /********************************************************************************
     * getValidUrl: Url포멧이 맞는지 확인한다. 예를 들면 앞에 /가 없으면../를 붙여준다.
     ********************************************************************************/
    getValidUrl:function(url){
        if(url.indexOf('/') == 0)return url;
        else return '/'+url;
    },

    /********************************************************************************
     * drawCombobox: 콤보박스 구현
     ********************************************************************************/
    drawCombobox: function(id, obj, title) {
        $("#" + id + ' option').remove();

        $.each(obj, function(index, item){
            $('#'+id).append("<option value=" + obj[index].key +">" + obj[index].val + "</option>");
        });
    },

    removeUndefined:function(str){
        return (str == undefined)? "&nbsp;": str;
    }


}
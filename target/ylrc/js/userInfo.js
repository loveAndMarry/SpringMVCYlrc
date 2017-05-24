/**
 * Created by 18401606107 on 2017/5/5.
 */
$(document).ready(function() {

    $("#infoSaveBtn").click(
        function () {
            var trueName=$("#trueName").val();
            var nickName=$("#editName").val();
            var number=$("#idNum").val();
            var height=$("#height").val();
            var weight=$("#weight").val();
            var location=$("#province option:selected").val();
            var date=$("#date option:selected").val();
            var month=$("#month option:selected").val();
            var year=$("#year option:selected").val();
            var sex  = $('input[name="sex"]:checked').val();
            var sexLove=$('input[name="sexLove"]:checked').val();
            var blood=$("#bloodType option:selected").val();
            var job=$("#job option:selected").val();
            var salary=$("#salary option:selected").val();
            var hobby=$("#hobby").val();
            var myLabel=$("#myLabel").val();
            var hopeLabel=$("#hopeLabel").val();
            var introductory=$("#introductory").val();
            if(trueName==null||trueName==""||nickName==null||nickName==""||number==null||number==""||introductory==null||introductory==""){
                alert("请完善您的个人信息!");
                return;
            }
            if(date==null||date==""||month==null||month==""||year==null||year==""){
                alert("请选择您的出生日期!");
                return;
            }
            if(blood==null||blood==""||job==null||job==""||salary==null||salary==""){
                alert("请完善您的个人信息!");
                return;
            }
            if(hobby==null||hobby==""||myLabel==null||myLabel==""||hopeLabel==null||hopeLabel==""){
                alert("请完善您的个人信息!");
                return;
            }

            else{
                $.ajax({
                    type : 'post',
                    url :'infoSave',
                    dataType : 'json',
                    contentType: 'application/json',
                    cache:false,
                    data:JSON.stringify({"trueName":$("#trueName").val(),"nickName":$("#editName").val(),
                        "number":$("#idNum").val(),"height":$("#height").val(),"weight":$("#weight").val(),"location":location,
                        "date":date,"month":month,"year":year,"sex":sex,"sexLove":sexLove,"blood":blood,"job":job,
                        "salary":salary,"myLabel":myLabel,"hopeLabel":hopeLabel,"hobby":hobby,"introductory":introductory
                    }),
                    success:function (data) {
                        if(data.result=="success"){
                            window.location.href="/userInfoControl"
                        }else{
                            alert("用户名或密码错误");
                        }
                    },
                    error:function (XMLHttpRequest,textStatus,errorThrown) {
                        alert(introductory);
                        alert(XMLHttpRequest.status);
                        alert(XMLHttpRequest.readyState);
                        alert(textStatus);
                    }
                });//...ajaxXML
            }}
    );

    $("#uploadBtn").click(
    function (){
       var imgPath=$("#image_input").val();
       if(imgPath==""){ alert("请选择图片!"); return;}
        var imgFix=imgPath.substr(imgPath.lastIndexOf('.')+1);
       if(imgFix!='jpg'&&imgFix!='png'&&imgFix!='gif'){
                   alert("请上传图片文件!");
                     return;
       }

       $("#form").ajaxSubmit({
           type:'POST',
           url:'upload/image',
           success:function (data) {
               alert("上传成功");
               $("#imgDiv").hide();
               // $("#imgDiv").html('<img src="'+data+'"/>');
               $("#userImg").attr('src',data);
              $("#userImg").attr('width','100px');
               $("#userImg").attr('height','100px');
               $("#imgDiv").show();
           },
           error:function () {
               alert("上传失败!");
           }
       });
    });

});

/**
 * Created by 18401606107 on 2017/4/19.
 */
$(document).ready(function() {
    $("#loginButton").click(
        function () {
            var x=$("#user").val();
            var y=$("#password").val();
            if(x==null||x==""||y==null||y==""){
                alert("用户名密码不能为空!");
                return;
            }
            else{
                $.ajax({
                    type : 'post',
                    url :'loginCheck',
                    dataType : 'json',
                    contentType: 'application/json',
                    cache:false,
                    data:JSON.stringify({"user":$("#user").val(),"password":$("#password").val()}),
                    success:function (data) {
                        if(data.result=="success"){
                            window.location.href="/homePage"
                        }else{
                            alert("用户名或密码错误");
                        }
                    },
                    error:function (XMLHttpRequest,textStatus,errorThrown) {
                        alert(XMLHttpRequest.status);
                        alert(XMLHttpRequest.readyState);
                        alert(textStatus);
                    }
                });//...ajaxXML
            }}
    );
});



$(document).ready(function () {
    $("#register").click(function () {
        var x=$("#uEmail").val();
        var y=$("#yzm").val();
        var z=$("#uPassWord").val();
        var phone=document.getElementById("uPhone");
        var p=$("#uPhone").val();
        if(x==""||x==null||y==""||y==null||z==""||z==null||p==""||p==null)
        {
            alert("输入信息不能为空！！");
            return;
        }
        else if(phone.value.length!=11||!/^1[3|5|8][0-9]\d{4,8}$/.test(phone.value))
        {
            alert("手机号码格式有误");
            return;
        }
        else{
            $.ajax({
                type:'post',
                url:'registerCheck',
                dataType:'json',
                contentType:'application/json',
                cache:false,
                data:JSON.stringify({"userPhone":$("#uPhone").val(),"userEmail":$("#uEmail").val(),"passWord":$("#uPassWord").val(),"yzm":$("#yzm").val()}),
                success:function(data) {
                    if (data.result == "success") {
                        alert("注册成功！");
                        window.location.href = "/login"
                    }
                    else if (data.result == "fail") {
                        alert("注册失败，邮箱或手机号已注册过了！");
                    }
                    else if (data.result == "failYZM")
                    {
                        alert("注册失败，请检查验证码！");
                    }

                },
                error:function(data){
                    alert("连接失败!!!!!!");
                }

            });//ajax end
        }
    });//registerBUtton .click end

    $("#sendYzm").click(function () {
        var x=$("#uEmail").val();
        if(x==null||x=="")
        {
            alert("请输入您的邮箱!");
            return;
        }
        else
        {
            $.ajax({
                type:'post',
                url:'getYzm',
                dataType:'json',
                contentType:'application/json',
                cache:false,
                data:JSON.stringify({"userEmail":$("#uEmail").val()}),
                success:function (data) {
                    if(data.result=="sendSuccess")
                    {
                        alert("已发送验证码！");
                    }

                },
                error:function(data){
                    alert("连接失败!!!");
                }

            });
        }



    });
});



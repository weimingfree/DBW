<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/addBook.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/ajaxfileupload.js"></script>
</head>

<body>
<div id="addAll">
    <div id="nav">
        <p>学生信息管理>更新学生信息</p>
    </div>
    <script type="text/javascript">
        function myclose() {
            window.location="${pageContext.request.contextPath}/admin/managermain";
            //window.close();
        }
    </script>
    <div id="table">
        <form action="${pageContext.request.contextPath}/studentInfo/update.action" enctype="multipart/form-data" method="post" id="myform">
            <table>

                <tr>
                    <td class="one">学生学号</td>
                    <td><input type="text" name="sid" class="two" value="${thisstudent.sno}"></td>
                </tr>

                <tr>
                    <td class="one">学生姓名</td>
                    <td><input type="text" name="sname" class="two" value="${thisstudent.sname}"></td>
                </tr>

                <tr>
                    <td class="one">学生性别</td>
                    <td><input type="text" name="ssex" class="two" value="${thisstudent.ssex}"></td>
                </tr>
                <tr>
                    <td class="one">学生年龄</td>
                    <td><input type="text" name="sage" class="two" value="${thisstudent.sage}"></td>
                </tr>
                <tr>
                    <td class="one">学生系别</td>
                    <td><input type="text" name="sdept" class="two" value="${thisstudent.sdept}"></td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="提交" class="btn btn-success">
                    </td>
                    <td>
                        <input type="reset" value="取消" class="btn btn-default" onclick="myclose()">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>

</body>

</html>

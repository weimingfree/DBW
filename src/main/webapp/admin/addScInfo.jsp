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
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/ajaxfileupload.js"></script>
</head>
<body>
<!--取出上一个页面上带来的page的值-->

<div id="addAll">
    <div id="nav">
        <p>成绩管理>新增成绩信息</p>
    </div>

    <div id="table">
        <form action="${pageContext.request.contextPath}/scInfo/save.action" enctype="multipart/form-data"
              method="post" id="myform">
            <table>
                <tr>
                    <td class="one">学生号</td>
                    <td><input type="text" name="sno" class="two" value="${thissc.sno}"></td>
                </tr>

                <tr>
                    <td class="one">课程号</td>
                    <td><input type="text" name="cno" class="two" value="${thissc.cno}"></td>
                </tr>

                <tr>
                    <td class="one">课程成绩</td>
                    <td><input type="text" name="grade" class="two" value="${thissc.grade}"></td>
                </tr>


                <tr>
                    <td>
                        <input type="submit" value="提交" class="btn btn-success">
                    </td>
                    <td>
                        <input type="reset" value="取消" class="btn btn-default" onclick="myclose()">
                        <script type="text/javascript">
                            function myclose() {
                                window.location="${pageContext.request.contextPath}/admin/scInfo";
                            }
                        </script>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>

</body>

</html>

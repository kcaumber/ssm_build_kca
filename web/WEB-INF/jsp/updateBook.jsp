<%--
  Created by IntelliJ IDEA.
  User: xinleyang
  Date: 10/25/20
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <%--    bootstrap--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column" >
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/UpdatePaper" method="post">

<%--        隐藏域--%>
        <input type="hidden" name="bookID" value="${QBooks.bookID}">
        <div class="form-group">
            <label for="bkname">书籍名称:</label>
            <input type="text" class="form-control" name="bookName" id="bkname" value="${QBooks.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bkcount">书籍数量:</label>
            <input type="text" class="form-control" name="bookCounts" id="bkcount" value="${QBooks.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="bkdetail">书籍描述:</label>
            <input type="text" class="form-control" name="detail" id="bkdetail" value="${QBooks.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="确定修改"/>
        </div>
    </form>
</div>
</body>
</html>

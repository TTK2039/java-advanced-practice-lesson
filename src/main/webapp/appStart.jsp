<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
  %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Java応用_演習問題10</title>
            <style>
                body {
                    border: solid 2px #000080;
                    padding: 5px;
                }
                
                .result {
                    background: #fffacd;
                    display: inline-block;
                    margin: 5px;
                    padding: 10px;
                }
            </style>
        </head>

        <body>

            <h1>Java応用 - 演習問題10</h1>

            <h2>ゲームアプリ実行ページ</h2>
            <c:if test="${not empty name}">
                <div class="result">
                    <h3>アプリの実行結果</h3>
                    <p>
                        ${requestScope.name}<br>
                        ${requestScope.time}
                    </p>
                </div>

            </c:if>
            <form action="StartAppServlet" method="post">
                <label>ユーザ名：</label>
                <input type="text" name="name">
                <br>
                <input type="radio" name="app" value="cards" checked>トランプ
                <input type="radio" name="app" value="darts">ダーツ
                <input type="radio" name="app" value="clock">時計
                <input type="radio" name="app" value="other">その他
                <br>
                <button type="submit">実行</button>
            </form>
        </body>

        </html>
<html>
<body>
<#--<div>
    <button onclick="download()">下载</button>
</div>-->
<br>
<div>
    <form method="post" action="download">
        <button class="download" type="submit">下载</button>
    </form>
</div>
</body>


</html>

<script src="/static/jquery-3.3.1.js"></script>
<script>

    function download() {
        $.ajax({
            type: "GET",
            url: "download"
        });
    }
</script>
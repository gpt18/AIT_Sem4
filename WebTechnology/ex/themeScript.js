function showPreview() {
    var html = document.getElementById("htmlCode").value;
    var frame = document.getElementById("preview").contentWindow.document;
    frame.open();
    frame.write(html);
    frame.close();
}
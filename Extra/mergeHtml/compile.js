function showPreview() {
    var html = document.getElementById("DivContent").value;
    var frame = document.getElementById("preview").contentWindow.document;
    frame.open();
    frame.write(html);
    frame.close();
}
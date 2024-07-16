// 상세조회
function getTodoByNo() {
  // console.log("상세조회");

  const noValue = document.querySelector("input[name=no]").value;
  document.querySelector("input[name=no]").value = "";

  $.ajax({
    url: "http://127.0.0.1:8080/todo/detail",
    method: "get",
    data: {
      no: noValue
    },
    success: function (x) {
      console.log(x);

      const detailTag = document.querySelector("#detailArea");
      let str = "";
      str += "<h3>상세조회</h3>";
      str += "<h3>" + "번호:" + x.no + "</h3>";
      str += "<h3>" + "할일:" + x.content + "</h3>";
      str += "<textarea name='changeContent'></textarea>";
      str += `<button onclick='edit(${x.no});'>수정하기</button>`;
      str += `<button onclick='del(${x.no});'>삭제하기</button>`;

      detailTag.innerHTML = str;
    },
  });
}
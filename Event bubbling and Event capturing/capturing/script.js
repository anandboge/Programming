// Event bubling

const body = document.getElementsByTagName("body")[0];
body.addEventListener(
  "click",
  () => {
    console.log("body clicked");
  },
  true
);

const div = document.getElementsByClassName("cont")[0];
div.addEventListener(
  "click",
  () => {
    console.log("div clicked");
  },
  true
);

const span = document.getElementsByTagName("span")[0];
span.addEventListener(
  "click",
  () => {
    console.log("span clicked");
  },
  true
);

const button = document.getElementsByTagName("button")[0];
button.addEventListener(
  "click",
  () => {
    console.log("button clicked");
  },
  true
);

const html = document.getElementsByTagName("html")[0];
html.addEventListener(
  "click",
  () => {
    console.log("html clicked");
  },
  true
);

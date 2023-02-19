const preview = document.getElementById('preview');
const videoSource = new MediaSource();
preview.src = URL.createObjectURL(videoSource);

videoSource.addEventListener('sourceopen', () => {
  const videoBuffer = videoSource.addSourceBuffer('video/mp4; codecs="avc1.64001f"');

  fetch('/video')
    .then(response => response.arrayBuffer())
    .then(arrayBuffer => {
      const videoData = new Uint8Array(arrayBuffer);
      videoBuffer.appendBuffer(videoData);
    });
});

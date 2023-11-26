const message = document.getElementById('message')
const btnClose = document.getElementById('btn-close')

function closeMessage(e) {
  e.preventDefault()
  message.classList.add('hidden')
    btnClose.removeEventListener('click', closeMessage)
  }
btnClose.addEventListener('click', closeMessage)
setTimeout(closeMessage, 3000)
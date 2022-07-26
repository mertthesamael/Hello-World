import React from 'react'

function Footer(){
let date = new Date()
console.log(date.getFullYear())
return (
    <footer>
        <p>Copyright {date.getFullYear()}</p>
    </footer>
)

}

export default Footer;
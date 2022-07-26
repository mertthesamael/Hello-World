import Header from "./Header"
import React from 'react'
import Footer from './Footer'
import Note from './Note'
import DATA from "../Notes.json"

function App(){

    return (<div>
        
        <Header />
        <Footer />
        {DATA.map(x=> <Note content={x.content} title={x.title}/>)}

    </div>)
}

export default App;
import MenuItem from "./Components/Side Menu/MenuItems/MenuItem.js"
import './App.css';
import MenuData from "./Components/Side Menu/MenuData.json"
import MenuFooter from "./Components/Side Menu/MenuItems/MenuFooter.js";
import Card from './Components/NFT/Card/Card';
import DATA from "./Components/NFT/NftData.json"

function App() {
  return (

    <div className="body">
     <div className="inner-body">
      <div class="nft-section">
        {DATA.map( (x) => (
        <Card nft={x.url} title={x.title} price={x.price} currency={x.currency} publisher={x.publisher}/>)
         )}
      </div>
     </div>

      <div className="menu">
        {MenuData.map( (x) => (
        <MenuItem title={x.title} icon={x.icon}/>)
         )}
        <MenuFooter />
      </div>

    </div>


  );
}

export default App;

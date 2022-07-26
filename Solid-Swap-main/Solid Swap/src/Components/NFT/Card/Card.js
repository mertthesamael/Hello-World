import "./Card.css"
import Nft from "./Nft"
import NftInfo from "./NftInfo"

const Card= (props) =>{


return ( 

    <div className="nft-card">
        
        <Nft nft={props.nft}/>

        <NftInfo title={props.title} price={props.price} publisher={props.publisher} currency={props.currency}/>
    </div>

)


}
export default Card;
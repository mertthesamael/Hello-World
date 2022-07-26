import NftName from "./NftName";
import NftPrice from "./NftPrice";
import Publisher from "./Publisher";


const NftInfo = (props)=>{


    return (
        <div className="nft-info">
            <NftName name={props.title}/>
            <NftPrice price={props.price} currency={props.currency}/>
            <Publisher publisher={props.publisher}/>
            
        </div>
    )

}

export default NftInfo;
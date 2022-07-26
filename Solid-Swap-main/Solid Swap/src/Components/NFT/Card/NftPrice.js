


const NftPrice= (props) => {


    return (

        <p className="nft-price">{(props.price).toFixed(2)} <span className="nft-currency">{props.currency}</span></p>


    )

}

export default NftPrice;
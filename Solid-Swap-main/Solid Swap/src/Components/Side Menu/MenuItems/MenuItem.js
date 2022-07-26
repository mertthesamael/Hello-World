import "./Menu.css"
import MenuTitle from "./MenuTitle";
import Icon from "./Icon";

const MenuItem = (props) => {
console.log(props.title)
    return (

        <div className="menu-item">
            <MenuTitle title={props.title}/>
            <Icon img={props.icon}/>
        </div>

    )

}

export default MenuItem;
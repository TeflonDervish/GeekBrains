package OOP.task7.Fabric.FabricApp.src.Fabric;


import OOP.task7.Fabric.FabricApp.src.Interface.iGameItem;

public abstract class ItemGenerator{

    public void openReward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
    
}
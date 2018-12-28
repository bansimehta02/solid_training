package com.meditab.training.ocp.exercise;

public class ResourceAllocatorSpace extends Resource
{
    
    public int allocate()
    {
            resourceId = findFreeSpaceSlot();
            markSpaceSlotBusy(resourceId);   
    }

    public void free(int resourceId)
    {
            markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotFree(int resourceId)
    {
    }
    private void markSpaceSlotBusy(int resourceId)
    {
    }
    private int findFreeSpaceSlot()
    {
        return 0;
    }
}

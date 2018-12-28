package com.meditab.training.ocp.exercise;

public class ResourceAllocatorTime extends Resource
{

    public int allocate()
    {
        int resourceId=findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;   
    }
    public void free(int resourceId)
    {
 
            markTimeSlotFree(resourceId);
    }
    
    private void markTimeSlotBusy(int resourceId)
    {
    }
    
    private int findFreeTimeSlot()
    {
        return 0;
    }

    private void markTimeSlotFree(int resourceId)
    {
    }
}

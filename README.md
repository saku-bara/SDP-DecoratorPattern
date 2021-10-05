# SDP-DecoratorPattern Orujova Elmira SE-2008

This codes shows how the Decorator pattern works on example of photo editing app. User might want to do just basic automatic editing (ex. lightning, contrast, brightness etc.) but also might want some advanced editing features to be used. This code shows what changes were made and counts them. 

There is basic auto edit, but what if user wants several extra editings, it is convenient to use Decorator pattern, which dynamically adds new funtionality (editing). So behaviors are added to an individual object, without changing the class. 
```Java
PhotoEditor editor2 = new BasicAutoEdit();
        editor2 = new Graininess(editor2);
        editor2 = new SkinSmooth(editor2);
        editor2 = new SlimFace(editor2);
        System.out.println("Your photo is ready!");
        System.out.println(editor2.editPhoto());
        System.out.println("Number of non basic changes is : " + editor2.NumOfChanges()+ "\nthanks for using our service");
```
In this piece of code, we are adding new editings at run time, starting from basic changes. It also counts how many changes user has done and outputs it. The output will look like:
```
Your photo is ready!
Basic corrections were made. Graininess is added. Smooth effect was added. All faces on photo were slimmed. 
Number of non basic changes is : 3
thanks for using our service
```

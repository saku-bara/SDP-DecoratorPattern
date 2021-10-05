# SDP-DecoratorPattern Orujova Elmira SE-2008

This codes shows how the Decorator pattern works on example of photo editing app. User might want to do just basic automatic editing (ex. lightning, contrast, brightness etc.) but also might want some advanced editing features to be used. This code shows what changes were made and counts them. 

There is basic auto edit, but what if user wants several extra editings, it is convenient to use Decorator pattern, which dynamically adds new funtionality (editing). So behaviors are added to an individual object, without changing the class. 
***Java
PhotoEditor editor2 = new SlimFace(new SkinSmooth(new Graininess(new BasicAutoEdit())));
***


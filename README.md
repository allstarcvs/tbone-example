# Summary

This is an example application that uses TBone (https://github.com/allstarcvs/tbone)

# Preview

Click on this http://rawgit.com/allstarcvs/tbone-example/master/public/index.html to preview the result.

# Usage

Compile with maven

```
mvn clean package
```

Run a local http server, this will server the files using port 8000

```
cd public
python -m SimpleHTTPServer
```

Open the application in a browser

```
http://localhost:8000/
```

and you shall see "Hello World!"

# Exercises

Go to HelloWorld.java to add more DOM elements.  Check SemanticUi.Java in the TBone project for more utilities.

# Summary

This is an example application that uses TBone (https://github.com/allstarcvs/tbone)

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

module.exports = profileInfoRoute

function profileInfoRoute(app, database) {
    app.get("/profileInfo", function (request, result) {
        const accessToken = request.headers.access;
        database.collection("users").findOne({
            "accessToken": accessToken
        }, function (error, user) {
            if (user == null) {
                result.json({
                    "status": "error",
                    "message": "User has been logged out"
                });
            } else {
                delete user.password;
                delete user.accessToken;
                result.json({
                    "status": "success",
                    "message": "Record has been fetched.",
                    "data": user
                });
            }
        });
    });
}
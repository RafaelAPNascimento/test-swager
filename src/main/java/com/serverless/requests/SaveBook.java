package com.serverless.requests;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import model.Book;

public class SaveBook implements RequestHandler<Book, Book> {

    @Override
    public Book handleRequest(Book input, Context context) {

        LambdaLogger logger = context.getLogger();
        logger.log("=============== handleRequest: Save book\n");
        logger.log(" "+input);

        return input;
    }
}

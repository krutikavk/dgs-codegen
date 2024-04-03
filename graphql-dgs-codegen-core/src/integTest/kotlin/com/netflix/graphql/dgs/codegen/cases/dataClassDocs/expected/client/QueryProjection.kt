package com.netflix.graphql.dgs.codegen.cases.dataClassDocs.expected.client

import com.netflix.graphql.dgs.codegen.GraphQLProjection
import com.netflix.graphql.dgs.codegen.cases.dataClassDocs.expected.types.MovieFilter

public class QueryProjection : GraphQLProjection() {
    public fun search(movieFilter: MovieFilter, _projection: MovieProjection.() -> MovieProjection):
        QueryProjection {
        field("search", MovieProjection(), _projection, "movieFilter" to movieFilter)
        return this
    }
}

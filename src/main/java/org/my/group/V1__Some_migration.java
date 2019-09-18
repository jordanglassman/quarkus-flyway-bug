package org.my.group;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

public class V1__Some_migration extends BaseJavaMigration {
    @Override
    public void migrate(final Context context) throws Exception {
        System.out.println("migrating!");
    }
}

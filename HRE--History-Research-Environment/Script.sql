CREATE TABLE SENTENCE_TYPE_DEFNS

 (
                RECORD_NUM INTEGER NOT NULL,
                SET_PID SMALLINT NOT NULL,
                DEFN_PID SMALLINT NOT NULL,
                SENTENCE_TYPE_DEFNS_PID INTEGER NOT NULL,
                VISIBLE_ID INTEGER NOT NULL,
                OWNER_PID INTEGER NOT NULL,
                RIGHTS SMALLINT NOT NULL,
                COMMIT_PID INTEGER NOT NULL,

SENTENCE_TYPE_KEY		INT2,
REQUESTER_TYPE_TBL	INT2,
REQUESTER_TYPE_PID	INT2,
IS_DFLT_SENTENCE		BOOLEAN,

                CONSTRAINT SENTENCE_TYPE_DEFNS_INDEX PRIMARY KEY (RECORD_NUM)
);

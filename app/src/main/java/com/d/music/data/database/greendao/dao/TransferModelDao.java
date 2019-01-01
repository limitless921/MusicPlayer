package com.d.music.data.database.greendao.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.d.music.data.database.greendao.bean.TransferModel;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "TRANSFER_MODEL".
 */
public class TransferModelDao extends AbstractDao<TransferModel, String> {

    public static final String TABLENAME = "TRANSFER_MODEL";

    /**
     * Properties of entity TransferModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property TransferId = new Property(0, String.class, "transferId", true, "TRANSFER_ID");
        public final static Property TransferType = new Property(1, Integer.class, "transferType", false, "TRANSFER_TYPE");
        public final static Property TransferState = new Property(2, Integer.class, "transferState", false, "TRANSFER_STATE");
        public final static Property TransferCurrentLength = new Property(3, Long.class, "transferCurrentLength", false, "TRANSFER_CURRENT_LENGTH");
        public final static Property TransferTotalLength = new Property(4, Long.class, "transferTotalLength", false, "TRANSFER_TOTAL_LENGTH");
        public final static Property Id = new Property(5, String.class, "id", false, "ID");
        public final static Property Type = new Property(6, Integer.class, "type", false, "TYPE");
        public final static Property Seq = new Property(7, Integer.class, "seq", false, "SEQ");
        public final static Property SongId = new Property(8, String.class, "songId", false, "SONG_ID");
        public final static Property SongName = new Property(9, String.class, "songName", false, "SONG_NAME");
        public final static Property SongUrl = new Property(10, String.class, "songUrl", false, "SONG_URL");
        public final static Property ArtistId = new Property(11, String.class, "artistId", false, "ARTIST_ID");
        public final static Property ArtistName = new Property(12, String.class, "artistName", false, "ARTIST_NAME");
        public final static Property AlbumId = new Property(13, String.class, "albumId", false, "ALBUM_ID");
        public final static Property AlbumName = new Property(14, String.class, "albumName", false, "ALBUM_NAME");
        public final static Property AlbumUrl = new Property(15, String.class, "albumUrl", false, "ALBUM_URL");
        public final static Property LrcName = new Property(16, String.class, "lrcName", false, "LRC_NAME");
        public final static Property LrcUrl = new Property(17, String.class, "lrcUrl", false, "LRC_URL");
        public final static Property FileDuration = new Property(18, Long.class, "fileDuration", false, "FILE_DURATION");
        public final static Property FileSize = new Property(19, Long.class, "fileSize", false, "FILE_SIZE");
        public final static Property FilePostfix = new Property(20, String.class, "filePostfix", false, "FILE_POSTFIX");
        public final static Property FileFolder = new Property(21, String.class, "fileFolder", false, "FILE_FOLDER");
        public final static Property IsCollected = new Property(22, Boolean.class, "isCollected", false, "IS_COLLECTED");
        public final static Property TimeStamp = new Property(23, Long.class, "timeStamp", false, "TIME_STAMP");
    }

    ;


    public TransferModelDao(DaoConfig config) {
        super(config);
    }

    public TransferModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"TRANSFER_MODEL\" (" + //
                "\"TRANSFER_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: transferId
                "\"TRANSFER_TYPE\" INTEGER," + // 1: transferType
                "\"TRANSFER_STATE\" INTEGER," + // 2: transferState
                "\"TRANSFER_CURRENT_LENGTH\" INTEGER," + // 3: transferCurrentLength
                "\"TRANSFER_TOTAL_LENGTH\" INTEGER," + // 4: transferTotalLength
                "\"ID\" TEXT," + // 5: id
                "\"TYPE\" INTEGER," + // 6: type
                "\"SEQ\" INTEGER," + // 7: seq
                "\"SONG_ID\" TEXT," + // 8: songId
                "\"SONG_NAME\" TEXT," + // 9: songName
                "\"SONG_URL\" TEXT," + // 10: songUrl
                "\"ARTIST_ID\" TEXT," + // 11: artistId
                "\"ARTIST_NAME\" TEXT," + // 12: artistName
                "\"ALBUM_ID\" TEXT," + // 13: albumId
                "\"ALBUM_NAME\" TEXT," + // 14: albumName
                "\"ALBUM_URL\" TEXT," + // 15: albumUrl
                "\"LRC_NAME\" TEXT," + // 16: lrcName
                "\"LRC_URL\" TEXT," + // 17: lrcUrl
                "\"FILE_DURATION\" INTEGER," + // 18: fileDuration
                "\"FILE_SIZE\" INTEGER," + // 19: fileSize
                "\"FILE_POSTFIX\" TEXT," + // 20: filePostfix
                "\"FILE_FOLDER\" TEXT," + // 21: fileFolder
                "\"IS_COLLECTED\" INTEGER," + // 22: isCollected
                "\"TIME_STAMP\" INTEGER);"); // 23: timeStamp
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TRANSFER_MODEL\"";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, TransferModel entity) {
        stmt.clearBindings();

        String transferId = entity.getTransferId();
        if (transferId != null) {
            stmt.bindString(1, transferId);
        }

        Integer transferType = entity.getTransferType();
        if (transferType != null) {
            stmt.bindLong(2, transferType);
        }

        Integer transferState = entity.getTransferState();
        if (transferState != null) {
            stmt.bindLong(3, transferState);
        }

        Long transferCurrentLength = entity.getTransferCurrentLength();
        if (transferCurrentLength != null) {
            stmt.bindLong(4, transferCurrentLength);
        }

        Long transferTotalLength = entity.getTransferTotalLength();
        if (transferTotalLength != null) {
            stmt.bindLong(5, transferTotalLength);
        }

        String id = entity.getId();
        if (id != null) {
            stmt.bindString(6, id);
        }

        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(7, type);
        }

        Integer seq = entity.getSeq();
        if (seq != null) {
            stmt.bindLong(8, seq);
        }

        String songId = entity.getSongId();
        if (songId != null) {
            stmt.bindString(9, songId);
        }

        String songName = entity.getSongName();
        if (songName != null) {
            stmt.bindString(10, songName);
        }

        String songUrl = entity.getSongUrl();
        if (songUrl != null) {
            stmt.bindString(11, songUrl);
        }

        String artistId = entity.getArtistId();
        if (artistId != null) {
            stmt.bindString(12, artistId);
        }

        String artistName = entity.getArtistName();
        if (artistName != null) {
            stmt.bindString(13, artistName);
        }

        String albumId = entity.getAlbumId();
        if (albumId != null) {
            stmt.bindString(14, albumId);
        }

        String albumName = entity.getAlbumName();
        if (albumName != null) {
            stmt.bindString(15, albumName);
        }

        String albumUrl = entity.getAlbumUrl();
        if (albumUrl != null) {
            stmt.bindString(16, albumUrl);
        }

        String lrcName = entity.getLrcName();
        if (lrcName != null) {
            stmt.bindString(17, lrcName);
        }

        String lrcUrl = entity.getLrcUrl();
        if (lrcUrl != null) {
            stmt.bindString(18, lrcUrl);
        }

        Long fileDuration = entity.getFileDuration();
        if (fileDuration != null) {
            stmt.bindLong(19, fileDuration);
        }

        Long fileSize = entity.getFileSize();
        if (fileSize != null) {
            stmt.bindLong(20, fileSize);
        }

        String filePostfix = entity.getFilePostfix();
        if (filePostfix != null) {
            stmt.bindString(21, filePostfix);
        }

        String fileFolder = entity.getFileFolder();
        if (fileFolder != null) {
            stmt.bindString(22, fileFolder);
        }

        Boolean isCollected = entity.getIsCollected();
        if (isCollected != null) {
            stmt.bindLong(23, isCollected ? 1L : 0L);
        }

        Long timeStamp = entity.getTimeStamp();
        if (timeStamp != null) {
            stmt.bindLong(24, timeStamp);
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public TransferModel readEntity(Cursor cursor, int offset) {
        TransferModel entity = new TransferModel( //
                cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // transferId
                cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // transferType
                cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // transferState
                cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // transferCurrentLength
                cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // transferTotalLength
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // id
                cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // type
                cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // seq
                cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // songId
                cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // songName
                cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // songUrl
                cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // artistId
                cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // artistName
                cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // albumId
                cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // albumName
                cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // albumUrl
                cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // lrcName
                cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // lrcUrl
                cursor.isNull(offset + 18) ? null : cursor.getLong(offset + 18), // fileDuration
                cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19), // fileSize
                cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // filePostfix
                cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // fileFolder
                cursor.isNull(offset + 22) ? null : cursor.getShort(offset + 22) != 0, // isCollected
                cursor.isNull(offset + 23) ? null : cursor.getLong(offset + 23) // timeStamp
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, TransferModel entity, int offset) {
        entity.setTransferId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTransferType(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTransferState(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setTransferCurrentLength(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setTransferTotalLength(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setType(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setSeq(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setSongId(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setSongName(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setSongUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setArtistId(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setArtistName(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setAlbumId(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setAlbumName(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setAlbumUrl(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setLrcName(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setLrcUrl(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setFileDuration(cursor.isNull(offset + 18) ? null : cursor.getLong(offset + 18));
        entity.setFileSize(cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19));
        entity.setFilePostfix(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setFileFolder(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setIsCollected(cursor.isNull(offset + 22) ? null : cursor.getShort(offset + 22) != 0);
        entity.setTimeStamp(cursor.isNull(offset + 23) ? null : cursor.getLong(offset + 23));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected String updateKeyAfterInsert(TransferModel entity, long rowId) {
        return entity.getTransferId();
    }

    /**
     * @inheritdoc
     */
    @Override
    public String getKey(TransferModel entity) {
        if (entity != null) {
            return entity.getTransferId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
